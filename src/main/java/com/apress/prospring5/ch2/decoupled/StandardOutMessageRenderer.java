package com.apress.prospring5.ch2.decoupled;

public class StandardOutMessageRenderer implements MessageRenderer {
   private MessageProvider messageProvider;

   @Override
   public void render() {
      if (messageProvider == null) {
         throw new RuntimeException(
                 "You must set the property messageProvider of class:"
                         + StandardOutMessageRenderer.class.getName());
      }
      System.out.println(messageProvider.getMessage());
   }

   public void setMessageProvider(MessageProvider provider) {
      this.messageProvider = provider;
   }

   public MessageProvider getMessageProvider() {
      return this.messageProvider;
   }
}