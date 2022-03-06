package space.safeluren.mlpl.miraidactyl

import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.event.GlobalEventChannel
import net.mamoe.mirai.event.events.FriendMessageEvent
import net.mamoe.mirai.event.events.GroupMessageEvent
import net.mamoe.mirai.utils.info

object PluginMain : KotlinPlugin(
    JvmPluginDescription(
        id = "space.safeluren.mlpl.miraidactyl",
        name = "MiraiDactyl",
        version = "0.1.0"
    ) {
        author("平安路人")
        info(
            """
            翼龙面板在Mirai的API对接
        """.trimIndent()
        )
        // author 和 info 可以删除.
    }
) {
    override fun onEnable() {
        logger.info { "Plugin [MiraiDactyl] loaded" }
        //配置文件目录 "${dataFolder.absolutePath}/"
        val eventChannel = GlobalEventChannel.parentScope(this)
        eventChannel.subscribeAlways<GroupMessageEvent>{
            //群消息
        }
        eventChannel.subscribeAlways<FriendMessageEvent>{
            //好友信息
        }
    }
}
