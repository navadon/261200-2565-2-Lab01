public class AirPurifier {
    String model;
    int aqi;
    boolean isOn;

    AirPurifier(){}

    AirPurifier(String _model) {
        this(_model, 0);
    }

    AirPurifier(String _model, int _aqi) {
        this.model = _model;
        this.aqi = _aqi;
    }
}
