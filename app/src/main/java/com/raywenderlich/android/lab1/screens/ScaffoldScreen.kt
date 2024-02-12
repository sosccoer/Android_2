package com.raywenderlich.android.lab1.screens

import android.annotation.SuppressLint
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import com.raywenderlich.android.lab1.router.BackButtonHandler
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.raywenderlich.android.lab1.R
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import com.raywenderlich.android.lab1.router.Screen


@Composable
fun ScaffoldScreen(){
    MyScaffold()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyScaffold() {

}

@Composable
fun MyTopAppBar(scaffoldState: ScaffoldState){

}

@Composable
fun MyBottomAppBar(){

}