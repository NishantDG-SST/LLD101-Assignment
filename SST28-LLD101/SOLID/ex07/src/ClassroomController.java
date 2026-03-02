public class ClassroomController {

    private final DeviceRegistry reg;

    public ClassroomController(DeviceRegistry reg) {
        this.reg = reg;
    }

    public void startClass() {

        PowerControl pjPower = reg.getFirst(Projector.class);
        InputConnectable pjInput = reg.getFirst(InputConnectable.class);
        pjPower.powerOn();
        pjInput.connectInput("HDMI-1");

        BrightnessControl lights = reg.getFirst(BrightnessControl.class);
        lights.setBrightness(60);

        TemperatureControl ac = reg.getFirst(TemperatureControl.class);
        ac.setTemperatureC(24);

        AttendanceCapable scanner = reg.getFirst(AttendanceCapable.class);
        System.out.println("Attendance scanned: present=" + scanner.scanAttendance());
    }

    public void endClass() {
        System.out.println("Shutdown sequence:");
        reg.getFirst(Projector.class).powerOff();
        reg.getFirst(LightsPanel.class).powerOff();
        reg.getFirst(AirConditioner.class).powerOff();
    }
}