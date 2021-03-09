// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.android.communication.chat.implementation.converters;

import com.azure.android.communication.chat.models.ChatMessageContent;

/**
 * A converter between {@link com.azure.android.communication.chat.implementation.models.ChatMessageContent} and
 * {@link ChatMessageContent}.
 */
public final class ChatMessageContentConverter {
    /**
     * Maps from {com.azure.android.communication.chat.implementation.models.ChatMessageContent} to {@link ChatMessageContent}.
     */
    public static ChatMessageContent convert(
        com.azure.android.communication.chat.implementation.models.ChatMessageContent obj) {
        if (obj == null) {
            return null;
        }

        ChatMessageContent chatMessageContent = new ChatMessageContent()
            .setMessage(obj.getMessage())
            .setTopic(obj.getTopic());

        if (obj.getInitiatorCommunicationIdentifier() != null) {
            chatMessageContent.setInitiatorCommunicationIdentifier(obj.getInitiatorCommunicationIdentifier());
        }

        if (obj.getParticipants() != null) {
            chatMessageContent.setParticipants(obj.getParticipants());
        }

        return chatMessageContent;
    }

    private ChatMessageContentConverter() {
    }
}

