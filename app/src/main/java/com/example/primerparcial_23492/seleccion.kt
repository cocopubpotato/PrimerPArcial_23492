package com.example.primerparcial_23492

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable


fun Seleccion(){
    Column(modifier = Modifier.fillMaxSize().padding(top = 8.dp).padding(bottom = 8.dp).background(Color(0xFF2DB1CD)),
        verticalArrangement = Arrangement.SpaceEvenly,
  //      horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(modifier = Modifier.align(Alignment.End)) {
            Image(painter=painterResource(id=R.drawable.power), contentDescription = "power",contentScale = ContentScale.FillBounds,
                modifier = Modifier.size(20.dp))
            }
        //seleccion de personajes
        Box(modifier = Modifier.background(Color.Black).padding(8.dp).fillMaxWidth().size(400.dp)){
            Column() {
                Row(modifier= Modifier.size(130.dp)) {
                    Image(painter= painterResource(R.drawable.mii), contentDescription = "mii femenino") }
                Row(modifier= Modifier.size(130.dp)) {
                    Column() {
                        Image(painter= painterResource(R.drawable.fireemblem), contentDescription = "byleth eisner")
                        Image(painter= painterResource(R.drawable.sergio_canales), contentDescription = "sergio canales") }

                }
                Row(modifier= Modifier.size(130.dp)) {
                    Image(painter= painterResource(R.drawable.sonic), contentDescription = "sonic") }
            }
        }
        Text("Selecciona un personaje")

        Row() {
            // D PAD
            Box(modifier= Modifier.size(100.dp)){

                Image(painter=painterResource(id=R.drawable.up_arrow), contentDescription = "power",contentScale = ContentScale.FillBounds,
                    modifier = Modifier.size(25.dp).align(Alignment.TopCenter))
                Image(painter=painterResource(id=R.drawable.left_arrow), contentDescription = "power",contentScale = ContentScale.FillBounds,
                    modifier = Modifier.size(25.dp).align(Alignment.CenterStart))
                Image(painter=painterResource(id=R.drawable.right_arrow), contentDescription = "power",contentScale = ContentScale.FillBounds,
                    modifier = Modifier.size(25.dp).align(Alignment.CenterEnd))
                Image(painter=painterResource(id=R.drawable.down_arrow), contentDescription = "power",contentScale = ContentScale.FillBounds,
                    modifier = Modifier.size(25.dp).align(Alignment.BottomCenter))
            }
            //A and B
            Box(modifier= Modifier.size(100.dp).align(Alignment.Bottom)){
                Box(modifier=Modifier.background(Color.Blue).size(50.dp).align(Alignment.Center)){Text("A", textAlign = TextAlign.Center)}

            }
            Box(modifier= Modifier.size(100.dp).align(Alignment.Top)){
                Box(modifier=Modifier.background(Color.Blue).size(50.dp).align(Alignment.Center)){Text("B", textAlign = TextAlign.Center)}
            }
        }
        Box(modifier=Modifier.align(Alignment.CenterHorizontally)){
            Text("Nientiendo ISDN 5DS", color = Color.White, fontSize = 18.sp, modifier= Modifier.padding(bottom= 8.dp))
        }
    }

    }
