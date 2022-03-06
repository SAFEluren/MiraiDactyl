package space.safeluren.mlpl.miraidactyl

import net.mamoe.mirai.console.data.AutoSavePluginConfig
import net.mamoe.mirai.console.data.value

object Config: AutoSavePluginConfig("config") {
    val canUseGroup:MutableList<Long> by value(mutableListOf())
    val canUseUser:MutableList<Long> by value(mutableListOf())
    val url by value<String>("localhost")
    val authorzation by value<String>("翼龙面板API Key，可在[面板地址]/admin/api生成。")
    val commandPrefix by value<String>("/")
    val debugMode by value<String>("false")
}