package ProxyDP;


    public class Main {
        public static void main(String[] args) {
            // Simulating user roles
            CommandExecutor adminExecutor = new CommandExecutorProxy("admin");
            CommandExecutor normalUserExecutor = new CommandExecutorProxy("normal_user");

            adminExecutor.executeCommand("Other Command");
            adminExecutor.executeCommand("rm -rf");

            normalUserExecutor.executeCommand("Other Command");
            normalUserExecutor.executeCommand("rm -rf");
        }
    }

