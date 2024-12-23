package com.example.e_bakti.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import java.text.SimpleDateFormat
import java.util.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Notifpage(navController: NavController, modifier: Modifier = Modifier) {
    val notifications = remember { generateSampleNotifications() }
    var showClearDialog by remember { mutableStateOf(false) }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xff009B4A))
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            // Header
            Column(
                modifier = Modifier
                    .requiredHeight(80.dp)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Notifikasi",
                        color = Color.White,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )
                    IconButton(onClick = { showClearDialog = true }) {
                        Icon(
                            Icons.Default.Delete,
                            contentDescription = "Clear All",
                            tint = Color.White
                        )
                    }
                }
            }

            // Main Content
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .requiredHeight(680.dp)
                    .clip(RoundedCornerShape(topStart = 55.dp, topEnd = 55.dp))
                    .background(color = Color.White)
                    .align(Alignment.BottomCenter)
            ) {
                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(24.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(notifications) { notification ->
                        NotificationCard(
                            notification = notification,
                            onClick = {
                                when (notification.type) {
                                    NotificationType.CHALLENGE -> navController.navigate("challenge_detail")
                                    NotificationType.TASK -> navController.navigate("task_detail")
                                    NotificationType.ATTENDANCE -> navController.navigate("attendance")
                                }
                            }
                        )
                    }
                }
            }

            // Navigation at bottom
            Box(
                modifier = Modifier.align(Alignment.BottomCenter)
            ) {
                Navigation(navController = navController, modifier = Modifier)
            }
        }
    }

    if (showClearDialog) {
        AlertDialog(
            onDismissRequest = { showClearDialog = false },
            title = { Text("Hapus Semua Notifikasi") },
            text = { Text("Apakah Anda yakin ingin menghapus semua notifikasi?") },
            confirmButton = {
                TextButton(
                    onClick = {
                        // Handle clear all notifications
                        showClearDialog = false
                    }
                ) {
                    Text("Hapus", color = Color.Red)
                }
            },
            dismissButton = {
                TextButton(onClick = { showClearDialog = false }) {
                    Text("Batal")
                }
            }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun NotificationCard(
    notification: NotificationItem,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        colors = CardDefaults.cardColors(
            containerColor = if (!notification.isRead) Color(0xFFFDFAE4) else Color.White
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        )
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.Top
        ) {
            // Icon
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFE8F5E9)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = when (notification.type) {
                        NotificationType.CHALLENGE -> Icons.Default.EmojiEvents
                        NotificationType.TASK -> Icons.Default.AssignmentTurnedIn
                        NotificationType.ATTENDANCE -> Icons.Default.EventAvailable
                    },
                    contentDescription = null,
                    tint = Color(0xFF009B4A),
                    modifier = Modifier.size(24.dp)
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = notification.title,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    )
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = notification.message,
                    style = TextStyle(
                        fontSize = 14.sp,
                        color = Color.Gray
                    ),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = notification.timestamp,
                    style = TextStyle(
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                )

                if (!notification.isRead) {
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        horizontalArrangement = Arrangement.End,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        TextButton(
                            onClick = { /* Mark as read */ },
                            colors = ButtonDefaults.textButtonColors(
                                contentColor = Color(0xFF009B4A)
                            )
                        ) {
                            Text("Tandai sudah dibaca")
                        }
                    }
                }
            }
        }
    }
}

enum class NotificationType {
    CHALLENGE, TASK, ATTENDANCE
}

data class NotificationItem(
    val type: NotificationType,
    val title: String,
    val message: String,
    val timestamp: String,
    val isRead: Boolean = false
)

private fun generateSampleNotifications(): List<NotificationItem> {
    val dateFormat = SimpleDateFormat("dd MMM, HH:mm", Locale("id"))
    return listOf(
        NotificationItem(
            type = NotificationType.CHALLENGE,
            title = "Challenge Baru",
            message = "Challenge 1: Buatlah video perkenalan kampus dengan durasi min 5 menit. Upload di Instagram dan gunakan caption yang menarik.",
            timestamp = dateFormat.format(Date(System.currentTimeMillis() - 3600000)), // 1 hour ago
            isRead = false
        ),
        NotificationItem(
            type = NotificationType.TASK,
            title = "Tugas Baru",
            message = "Tugas 1: Buatlah ringkasan perkenalan kampus serta UMKM dalam format PDF.",
            timestamp = dateFormat.format(Date(System.currentTimeMillis() - 7200000)), // 2 hours ago
            isRead = true
        ),
        NotificationItem(
            type = NotificationType.ATTENDANCE,
            title = "Absensi Baru",
            message = "Absensi untuk kegiatan Bakti hari ini telah dibuat. Silakan melakukan absensi.",
            timestamp = dateFormat.format(Date(System.currentTimeMillis() - 10800000)), // 3 hours ago
            isRead = false
        )
    )
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun NotifpagePreview() {
    val navController = rememberNavController()
    Notifpage(navController = navController)
}