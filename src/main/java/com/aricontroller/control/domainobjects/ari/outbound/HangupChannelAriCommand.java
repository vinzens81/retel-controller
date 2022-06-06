package com.aricontroller.control.domainobjects.ari.outbound;

import com.aricontroller.control.domainobjects.ari.inbound.AriCommandId;
import com.aricontroller.control.domainobjects.shared.ChannelId;

public record HangupChannelAriCommand(AriCommandId ariCommandId, ChannelId channelId)
    implements AriCommand {}
