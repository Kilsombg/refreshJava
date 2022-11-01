package laboratory_B.lab2.zadacha4;

import java.text.DecimalFormat;

public class CPU {
    private int cpus;
    private final int cores;
    private double clockRate;

    public double getClockRate() {
        return clockRate;
    }

    public void setClockRate(double clockRate) {
        this.clockRate = clockRate;
    }

    public int getCpus() {
        return cpus;
    }

    public void setCpus(int cpus) {
        this.cpus = cpus;
    }

    public int getCores() {
        return cores;
    }

    public CPU(int cpus, int cores, double clockRate) {
        this.cpus = cpus;
        this.cores = cores;
        this.clockRate = clockRate;
    }

    public double calculateClockRate() {
        DecimalFormat df = new DecimalFormat("0.000");
        double coefficient = 1;
        if (cores > 1) coefficient *= 0.7;
        if (cpus > 1) coefficient *= 0.8;

        return Double.parseDouble(df.format(cores * cpus * clockRate * coefficient));
    }

    public double takenTime(double time) {
        DecimalFormat df = new DecimalFormat("0.0");

        return Double.parseDouble(df.format(time * calculateClockRate() / clockRate));
    }

    @Override
    public String toString() {
        return "CPU{" +
                "cpus=" + cpus +
                ", cores=" + cores +
                ", clockRate=" + clockRate +
                '}';
    }
}
