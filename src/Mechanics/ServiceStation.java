package Mechanics;

import Cars.Transport;
import Cars.bus.Bus;
import Cars.exeption.DiagnosticExeption;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
    private static final Queue<Transport<?>> transportQueue = new ArrayDeque<>();

    public static void addTransportQueue(Transport<?> transport){
        if (transport instanceof Bus){
            System.out.println("Автобусы не нуждаются в техобслуживании.");
        } else {
            transportQueue.add(transport);
        }
    }

    public static void serviceTransport(){
        Transport<?> transport = transportQueue.poll();

        if (transport != null) {
            try {
                transport.diagnostics();
                transport.getMechanics().get(0).maintenance();
            } catch (DiagnosticExeption e) {
                System.out.println("Ошибка проведения ТО " + transport);;
            }
        }
    }
}
