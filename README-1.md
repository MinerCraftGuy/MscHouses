# Welcome to MscHouses!

**All Latest Official Versions Can Be Found [here] (http://minecraft.curseforge.com/mc-mods/msc-houses/files/) Starting with version 5.0

## Compiling MscHouses
***
Do you want to contrubute to the MscHouses mod? If you do, you might find this handy
**Disclaimer**
`mrkirby153 is not responsable for any OS crashes or fatal errors caused by incorrectly installing Java JRE, Java SDK. This includes but is not limited to Blue Screen of Death, System Crash, Malware or any type of Virus. This code cloned directly from THIS github repository  only is 100% virus free guarenteed.` Please referr to [this] (https://dl.dropboxusercontent.com/u/121954827/modding/MscHouses/Virus_Scan.JPG) `Link for proof that this repository contains ABSOLUTLY NO Viruses.
 mrkirby153 would like to thank you for your understanding and coorperation`
1. Download and install Java JRE (*Java Runtime Environment*). You should already have it installed because you can't run minecraft without it. But, if you don't, you can download it [here] (http://www.java.com/inc/BrowserRedirect1.jsp?locale=en)
2. Download and install Java SDK (*Standard Development Kit*) [here] (http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html)
3. Download and install [Apache Ant] (http://ant.apache.org/)
4. Download and install [Git] (http://git-scm.com/downloads)
5. Create an empty Directory for Development. This directory is referred to as `Dev` for the remainder of the tutorial

#### Set Up MCP
1. Download the latest version of MCP [here] (http://mcp.ocean-labs.de/index.php/MCP_Releases).
2. Inside `Dev`, create a directory called `mcp` and extract MCP into it.
 * To verify, check if a file named `CHAGELOG` exists inside of `MCP`
3. Download the latest forge ___SOURCE___ (At Least 9.10.0.789) and unzip it into `mcp`. You can get it from [here] (http://files.minecraftforge.net)
4. Excecute `install.cmd` (Windows) or `install.sh` (Linux and Mac) located in `mcp/forge`. This will take anywhere from 5-20 minutes depending on your computer's proccessing power
***
####Set Up MscHouses
1. Inside `Dev`, create a directory named `source`.
2. Clone `MscHouses` into `source` by excecuting the following command `$ git clone https://github.com/mrkirby153/MscHouses.git` (HTTPS) or `$ git clone git@github.com:mrkirby153/MscHouses.git` (SSH)
3. Your file structure should look like this now
`
    dev
        \-mcp
            \-mcp stuff (should have CHANGELOG)
            \-forge
            \-jars
        \-source
            \-MscHouses
                \-MscHouses' files (should have a build.xml)
    
`
***
4. Inside `MscHouses`, create a new file called `build.properties`
    * Open it up with any text editor and type the following into it (Fully customizable except for `dir.development`):
    * `dir.development=../../`
    * `dir.release=Releases`
    * `release.minecraft.version=1.6.2` or the version you are compiling
    * `release.mod.version=<Mod Version>`
5. Open your OS's command line interface (cmd [Command Prompt] for Windows, Terminal for Linux and Mac)
6. Navigate to `dev\source\MscHouses` by typing `cd <dev volder location\source\MscHouses`.
7. Excecute `ant release`. This should take anywhere between 5 and 15 minutes. Once again depending on your Computer's Proccessing speed
8. After the build, if `BUILD SUCCESSFULL` is not displayed, open an issue ticket with the console log. If it is, navigate to `dev\source\MscHouses\Releases\<Minecraft Version\<Version Number>\` and locate the file named `Msc Houses-universal-<VERSION NUMBER>.jar`
9. Install that file to your mods folder and play Minecraft!
***
### Contributing to MscHouses
1. Fork the MscHouses repository by clicking the box marked `fork`
2. Once you've forked the repository successfully, clone ___YOUR___ repository to your local machene.
3. Code, Code, Code! Change anything you wish with the mod
 * Please code in a seperate branch. Do not use the branch `master`
4. Once you're done, click the `pull request` button on the upper right and submit the request
5. Wait. Wait to see if I like the changes you made to the mod. If I like it, I'll merge the request into the repo.
6. Done!
***
### Submitting an issue
Find a bug? Minecraft won't start? Have an idea?
1. Head over to the [Issue Page] (https://github.com/mrkirby153/MscHouses/issues)
2. Create or log into your github account
3. Click `New Issue`
4. Enter the issue's title, (Something summarizing the issue) and a ___DETAILED__ description of how you came about this bug.
 * Remember: ___CRASHLOG OR IT DIDN'T HAPPEN___ (That is, if you're reporting a bug and ther is a crashlog)
5. Click `Submit Issue` and you're done!