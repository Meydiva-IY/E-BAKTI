//@Composable
//fun ButtonDataPesertaBakti(modifier: Modifier = Modifier) {
//    TextButton(
//        onClick = { },
//        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
//        modifier = modifier
//            .requiredWidth(width = 278.dp)
//            .requiredHeight(height = 116.dp)
//    ) {
//        Box(
//            modifier = Modifier
//                .requiredWidth(width = 278.dp)
//                .requiredHeight(height = 116.dp)
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.designer),
//                contentDescription = "Designer",
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .requiredWidth(width = 278.dp)
//                    .requiredHeight(height = 116.dp)
//                    .clip(shape = RoundedCornerShape(6.dp)))
//            Text(
//                text = "Absensi",
//                color = Color(0xfffdfae4),
//                fontStyle = FontStyle.Italic,
//                style = TextStyle(
//                    fontSize = 30.sp,
//                    fontWeight = FontWeight.Medium),
//                modifier = Modifier
//                    .align(alignment = Alignment.TopCenter)
//                    .offset(x = (-59.5).dp,
//                        y = 38.dp))
//        }
//    }
//}
//
//@Preview(widthDp = 278, heightDp = 116)
//@Composable
//private fun ButtonDataPesertaBaktiPreview() {
//    ButtonDataPesertaBakti(Modifier)
//}