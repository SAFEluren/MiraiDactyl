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
    }
) {
    override fun onEnable() {
        Config.reload()
        //配置文件目录 "${dataFolder.absolutePath}/"
        logger.info {"\n"+
            "  __  __ _           _         \n" +
            " |  \\/  (_)_ __ __ _(_)        \n" +
            " | |\\/| | | '__/ _` | |        \n" +
            " | |  | | | | | (_| | |        \n" +
            " |_|__|_|_|_|  \\__,_|_|      _ \n" +
            " |  _ \\  __ _  ___| |_ _   _| |\n" +
            " | | | |/ _` |/ __| __| | | | |\n" +
            " | |_| | (_| | (__| |_| |_| | |\n" +
            " |____/ \\__,_|\\___|\\__|\\__, |_|\n" +
            "                       |___/   \n"+
            "插件[MiraiDactyl]已经成功加载.\n"+
            "请在配置文件中配置面板URL以及ApiKey.\n"+
            "ApiKey可以在"+Config.url+"/admin/api 处申请\n"+
            "已经启用的群聊:"+Config.canUseGroup+
            "\n已经启用的用户:"+Config.canUseUser+
            "\n面板URL:"+Config.url+
            "\n调试模式:"+Config.debugMode+
            "\n使用"+Config.commandPrefix+"mdhelp 获取本插件帮助"

        }

        val eventChannel = GlobalEventChannel.parentScope(this)
        eventChannel.subscribeAlways<GroupMessageEvent>{
            //群消息
        }
        eventChannel.subscribeAlways<FriendMessageEvent>{
            //好友信息
        }
    }
    override fun onDisable() {
        logger.info { "Plugin [MiraiDactyl] has successfully unloaded." }
    }
}
