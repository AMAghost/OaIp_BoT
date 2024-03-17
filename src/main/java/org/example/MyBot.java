import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {

        String chatId = update.getMessage().getChatId().toString();
        String text = update.getMessage().getText();

        SendMessage sendMassage = new SendMessage();
        sendMassage.setChatId(chatId);
        sendMassage.setText(text);

        try {
            this.execute(sendMassage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getBotUsername() {
        return "OaIp_bOt";
    }

    @Override
    public String getBotToken() {
        return "6915894385:AAHbBRsz4LZnlfVCPbgTy264nINMMcsO6S0";
    }
}
