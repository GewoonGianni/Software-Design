public class BridgeKeeperActions() {
    private Bridge bridge = new Bridge();

    private TrafficLight trafficLight = new TrafficLight();

    private RoadBarrier roadBarrier = new RoadBarrier();

    public void raiseBridge() {
        this.trafficLight.turnOnRed();
        this.roadBarrier.close();
        this.bridge.raise();
    }

    public void lowerBridge() {
        this.bridge.lower();
        this.roadBarrier.open();
        this.trafficLight.turnOnGreen();
    }
}

public class Bridge {
    public void raise() {
        // code omitted
    }

    public void lower() {
        // code omitted
    }
}

public class TrafficLight {
    public void turnOnRed() {
        // code omitted
    }

    public void turnOnGreen() {
        // code omitted
    }
}

public class RoadBarrier {
    public void open() {
        // code omitted
    }

    public void close() {
        // code omitted
    }
}

public void shutdownYasla() {
    logStatus();
    System.exit(0)
}

public void logStatus() {
    String status = "Yasla is shutting down.";
    status += "with errors: " + getErrors();
    log(status)
}

public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("/regex/",Pattern.CASE_INSENSITIVE)

public static boolean emailCheck(String emailStr) {
    Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
    return matcher.find();
}

public static boolean sqlCheck(String token){
    return token.replace("DROP", "").length() < token.length();
}