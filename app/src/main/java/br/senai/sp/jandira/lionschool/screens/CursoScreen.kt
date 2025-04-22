//package br.senai.sp.jandira.lionschool.screens
//
//import androidx.compose.foundation.BorderStroke
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.List
//import androidx.compose.material.icons.filled.Search
//import androidx.compose.material3.Card
//import androidx.compose.material3.CardDefaults
//import androidx.compose.material3.Icon
//import androidx.compose.material3.OutlinedTextField
//import androidx.compose.material3.OutlinedTextFieldDefaults
//import androidx.compose.material3.Text
//import androidx.compose.material3.TextFieldColors
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.rememberCoroutineScope
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.colorResource
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.res.stringResource
//import androidx.compose.ui.text.font.FontFamily
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import br.senai.sp.jandira.lionschool.R
//
//@Composable
//fun CursoScreen(){
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.White),
//        contentAlignment = Alignment.BottomCenter
//    ){
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(25.dp),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(5.dp),
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.Start
//            ) {
//                Image(
//                    painter = painterResource(),
//                    contentDescription = stringResource(),
//                    modifier = Modifier
//                        .width(45.dp)
//                        .height(56.dp)
//                        .padding(vertical = 5.dp)
//                )
//                Text(
//                    text = stringResource(),
//                    fontSize = 10.sp,
//                    color = colorResource(),
//                    fontWeight = FontWeight.Bold,
//                    fontFamily = FontFamily.Default,
//                    modifier = Modifier
//                        .width(50.dp)
//                        .padding(bottom = 10.dp)
//                )
//            }
//            Card(
//                modifier = Modifier
//                    .height(1.dp)
//                    .fillMaxWidth(),
//                colors = CardDefaults.cardColors(
//                    containerColor = colorResource()
//                )
//            ){}
//            OutlinedTextField(
//                value = "",
//                onValueChange = {},
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(5.dp),
//                shape = RoundedCornerShape(12.dp),
//                label = { Text(text = stringResource()) },
//                trailingIcon = {
//                    Icon(
//                        imageVector = Icons.Default.Search,
//                        contentDescription = "",
//                        tint = colorResource(R.color.lion_color_gray)
//                    )
//                },
//                colors = OutlinedTextFieldDefaults.colors(
//                    unfocusedBorderColor = colorResource(),
//                    unfocusedContainerColor = colorResource()
//                )
//            )
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth(),
//                horizontalArrangement = Arrangement.Start,
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Image(
//                    painter = painterResource(),
//                    contentDescription = "",
//                    modifier = Modifier
//                        .width(26.dp)
//                        .height(26.dp)
//                )
//                Text(
//                    text = stringResource(),
//                    fontSize = 24.sp,
//                    fontWeight = FontWeight.Bold,
//                    color = colorResource(),
//                    modifier = Modifier
//                        .padding(horizontal = 5.dp)
//                )
//            }
//
//        }
//    }
//}
//
//@Preview(showSystemUi = true)
//@Composable
//private fun CursoScreenPreview(){
//    CursoScreen()
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//@Preview(showSystemUi = true)
//@Composable
//private fun TelaCursoPreview(){
//    TelaCurso()
//}
