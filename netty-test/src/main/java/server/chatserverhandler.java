package server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

public class chatserverhandler extends SimpleChannelInboundHandler<String> {
    //全局通道组，所有通道都会加入到该组
    private static ChannelGroup channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, String s) throws Exception {
        System.out.println(s);
        channelGroup.writeAndFlush(channelHandlerContext.channel().remoteAddress() + "说：" + s + "\n");
    }
}
