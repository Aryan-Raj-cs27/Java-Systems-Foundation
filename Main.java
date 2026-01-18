abstract class Message {
    abstract void playMessage();
}

class TextMessage extends Message {
    void playMessage() {
        System.out.println("Playing text message");
    }
}

class VoiceMessage extends Message {
    void playMessage() {
        System.out.println("Playing voice message");
    }
}

class FaxMessage extends Message {
    void playMessage() {
    }
}

public class Main {
    public static void main(Strin
    }
}
