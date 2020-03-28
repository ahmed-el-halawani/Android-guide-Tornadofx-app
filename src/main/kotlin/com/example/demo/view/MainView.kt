package com.example.demo.view

import javafx.css.CssMetaData
import javafx.scene.Node
import javafx.scene.control.Button
import javafx.scene.image.Image
import javafx.scene.layout.Background
import javafx.scene.layout.VBox
import javafx.scene.paint.Color
import javafx.scene.paint.Paint
import tornadofx.*

class MainView : View("احلي ابليكاشن دة ولا اه") {
    override val root: VBox by fxml("/ahmed.fxml")

    val b1:Button by this.fxid("volley")
    val b2:Button by this.fxid("lookAndFeel")
    val b3:Button by this.fxid("notification")
    val b4:Button by this.fxid("appBar")
    val b5:Button by this.fxid("swipeToRefresh")
    val b6:Button by this.fxid("webApp")
    val b7:Button by this.fxid("androidGuide")

    private val httpList= arrayListOf("https://developer.android.com/training/volley",
            "https://developer.android.com/guide/topics/ui/look-and-feel",
            "https://developer.android.com/guide/topics/ui/notifiers/notifications",
            "https://developer.android.com/training/appbar",
            "https://developer.android.com/training/swipe",
            "https://developer.android.com/guide/webapps",
            "https://developer.android.com/guide")

    private val buttons = arrayListOf(b1,b2,b3,b4,b5,b6,b7)

    private fun activeButtonStyle(btn:Button){
        btn.style{
            this.backgroundColor += c("#c9302c")
        }
    }

    init {
        FX.primaryStage.icons.add(Image("/image/app_icon.png"))
        for(i in buttons){

            i.setOnAction {
                hostServices.showDocument(httpList[buttons.indexOf(i)])
            }

            i.setOnMousePressed {
                i.style{
                    this.backgroundColor += c("#ac2925")
                }
            }

            i.setOnMouseReleased {
                i.style{
                    this.backgroundColor += c("#ff0000")
                }
            }
        }




    }



}