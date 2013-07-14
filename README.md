## Welcome to MscHouses!

Here, you will find the latest code hot off the press.


[Compiling MscHouses] ()
***
### Compiling MscHouses

**Please note**: Mrkirby153 is not responsable for any OS crashes or fatal errors including but not limited to BSOD, and/or System Crash.

1. Download and install Java JRE. Avalable [here] (http://www.java.com/inc/BrowserRedirect1.jsp?locale=en) (100% Necicary of Apache ant and Minecraft??)
2. Download and install Java SDK Avalable [here] (http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html)
3. Download (Apache Ant) [http://ant.apache.org/]
4. Download `Smart Git` or any other git program.
5. Create an empty Directory for Development. This directory is refered to as `Dev`

#### Setup MCP
1. Download the latest version of MCP [here] (http://mcp.ocean-labs.de/index.php/MCP_Releases). Install MCP dependancies as listed on the website (if neccecary)
2. Inside `Dev`, create a directory called `mcp` and extract MCP into it.
 * TO verify, check if a file named `CHANGELOG` exists inside `MCP`
3. Download the latest forge ___source___ and unzip it into `mcp`. You need it from [here] (http://files.minecraftforge.net)
4. Excecute `install.cmd` (Windows) or `install.sh` (Linux and Mac). This will take anywhere from 5-20 minutes, depending on your computer's power.
#### Setup MscHouses
1. Inside `Dir`, create a directory names `source`.
2. Move/clone `MscHouses` into `source`.
3. You should have a file strcuture that looks lie this:
***

	dir
	\-mcp
		\-complicated mcp stuff (should have CHANGELOG).
		\-forge
		\-jars
	\-source
		\-MscHouses
			\-MscHouses's files (should have build.xml).
***
1. Inside `MscHouses`, create a new file called `build.properties`
		* Open it up with any text editor, and type into it the following (fully customizable except for `dir.development`):
 		* `dir.development=../../`
		* `dir.release=Releases`
		* `release.minecraft.version=1.5.1` (as of 3/29)
		* `release.mod.version=<Mod Version>` 
2. [FOR WINDOWS] Open up `cmd` by typing `cmd` in Run.
3. [FOR WINDOWS] Navigate to `dir\source\MscHouses` by typing `cd <dev's location>\source\MscHouses`.
4. Execute `ant release`. This will take 5-15 minutes. (For me 2) depending on your computing power. If you've done everything correctly, `BUILD SUCCESSFULL` should be displayed.
5. Go to `dir\source\MscHouses\Releases\<Minecraft Version\<Mod Version>
	* You should see a jar named `MscHouses-Universal-<Version>.jar`
6. Install the mod and play Minecraft!
***
### Submitting an issue
Find an issue? Minecraft won't start? Have an idea?
1. Head over to the [Issues Page] (https://github.com/mrkirby153/MscHouses/issues)
2. Click `New Issue`
3. Enter the issue's title, (Something summarizing the issue) and a __Detailed Desription__. REMEMBER: ___CRASHLOG OR IT DIDN'T HAPEN___
4. Click `Submit Issue` and your done!
