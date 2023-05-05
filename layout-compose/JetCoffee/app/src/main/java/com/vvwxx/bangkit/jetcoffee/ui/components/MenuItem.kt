package com.vvwxx.bangkit.jetcoffee.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vvwxx.bangkit.jetcoffee.R
import com.vvwxx.bangkit.jetcoffee.model.Menu
import com.vvwxx.bangkit.jetcoffee.ui.theme.JetCoffeeTheme

@Composable
fun MenuItem(
    menu: Menu,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier.width(140.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column{
            Image(
                painter = painterResource(menu.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
            Column(modifier = Modifier.padding(8.dp)) {
                Text(
                    text = menu.title,
                    maxLines = 2, // menentukan jumlah baris maksimal dari text
                    overflow = TextOverflow.Ellipsis, // mekanisme yang dilakukan jika ada teks yang lebih panjang daripada ruang yang ada
                    style = MaterialTheme.typography.subtitle1.copy(
                        fontWeight = FontWeight.ExtraBold
                    ),
                )
                Text(
                    text = menu.price,
                    style = MaterialTheme.typography.subtitle2,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MenuItemPreview() {
    JetCoffeeTheme {
        MenuItem(
            menu = Menu(
                R.drawable.menu1,
                "Tiramisu Coffe Milk",
                "Rp 28.000"
            )
        )
    }
}