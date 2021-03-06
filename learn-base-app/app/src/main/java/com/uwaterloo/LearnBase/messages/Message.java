/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 Modified By Alireza
 */
package com.uwaterloo.LearnBase.messages;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Message {

    private String username;
    private String message;
    private long timestamp;

    public Message() {
    }

    public Message(String username, String message, Long timestamp) {
        this.username = username;
        this.message = message;
        this.timestamp = timestamp;
    }


    public String getUsername() {
        return username;
    }


    public String getMessage() {
        return message;
    }


    public long getTimestamp() {
        return timestamp;
    }


    public String getFormattedTimestamp() {
        String datePattern = "EEE, MMM d, h:mm a";
        SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
        Date messageCreationDate = new Date(timestamp);
        return dateFormat.format(messageCreationDate);
    }
}
