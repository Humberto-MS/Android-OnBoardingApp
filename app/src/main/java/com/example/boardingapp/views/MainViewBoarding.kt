package com.example.boardingapp.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.boardingapp.R
import com.example.boardingapp.data.PageData
import com.example.boardingapp.dataStore.StoreBoarding
import com.example.boardingapp.onBoardViews.OnBoardingPager
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun MainViewBoarding ( navController: NavController, store: StoreBoarding ) {
    val items = ArrayList<PageData>()

    items.add (
        PageData (
            R.raw.page1,
            "Bienvenidos",
            "Bienvenidos a la aplicación para mostrar el uso del OnBoarding"
        )
    )

    items.add (
        PageData (
            R.raw.page2,
            "Uso de OnBoarding",
            "Bienvenidos a la segunda página del Boarding mostrando una descripción"
        )
    )

    items.add (
        PageData (
            R.raw.page3,
            "Fin de Boarding",
            "Esta e sla página final del Boarding y ya debe aparecer el botón"
        )
    )

    val pagerState = rememberPagerState (
        pageCount = items.size,
        initialOffscreenLimit = 2,
        infiniteLoop = false,
        initialPage = 0
    )

    OnBoardingPager (
        item = items,
        pagerState = pagerState,
        modifier = Modifier
            .fillMaxWidth()
            .background ( Color.White ),
        navController = navController,
        store = store
    )
}