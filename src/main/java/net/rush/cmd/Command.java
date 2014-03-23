package net.rush.cmd;

import net.rush.model.CommandSender;

/**
 * Represents a single command.

 */
public abstract class Command {

	/**
	 * The name of the command.
	 */
	private final String command;

	/**
	 * Creates a new command.
	 * @param command The name of the new command without the slash prefix.
	 */
	public Command(String command) {
		this.command = command;
	}

	/**
	 * Gets the name of this command.
	 * @return The name of this command.
	 */
	public final String getCommand() {
		return command;
	}

	/**
	 * Executes this command.
	 * @param player The player that issued the command.
	 * @param args An array of this command's arguments.
	 */
	public abstract void execute(CommandSender sender, String[] args);

}

