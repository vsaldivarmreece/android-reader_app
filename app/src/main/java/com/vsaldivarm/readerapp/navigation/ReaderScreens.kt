package com.vsaldivarm.readerapp.navigation

enum class ReaderScreens {
    SplashScreen,
    LogInScreen,
    CreateAccountScreen,
    ReaderHomeScreen,
    HomeScreen,
    DetailsScreen;

    companion object {
        fun fromRoute(route: String): ReaderScreens =
            when (route?.substringBefore("/")) {
                SplashScreen.name -> SplashScreen
                LogInScreen.name -> LogInScreen
                null -> ReaderHomeScreen
                else -> throw IllegalArgumentException("Route $route is not recognized")
            }
    }

}