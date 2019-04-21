package com.apress.prospring5.ch2.decoupled;

public interface MessageRenderer {

   void setMessageProvider(MessageProvider provider);

   MessageProvider getMessageProvider();

   default void render() {
   }
}
