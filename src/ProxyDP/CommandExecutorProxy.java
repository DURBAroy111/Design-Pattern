package ProxyDP;

public class CommandExecutorProxy implements CommandExecutor {
    private CommandExecutor executor;
    private String userRole;

    public CommandExecutorProxy(String userRole) {
        this.executor = new CommandExecutorImplementation();
        this.userRole = userRole;
    }

    @Override
    public void executeCommand(String command) {
        if (userRole.equals("admin") || !command.startsWith("rm -rf")) {
            executor.executeCommand(command);
        } else {
            System.out.println("Permission denied. You are not allowed to execute 'rm -rf' command.");
        }
    }
}
