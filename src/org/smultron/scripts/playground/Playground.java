package org.smultron.scripts.playground;

import org.rspeer.script.ScriptMeta;
import org.smultron.framework.MullbarScript;
import org.smultron.framework.tasks.Task;

@ScriptMeta(desc = "playing around", developer = "smultron", name = "Playground")
public class Playground extends MullbarScript {
	@Override
	public Task nextTask() {
		return null;
	}
}
