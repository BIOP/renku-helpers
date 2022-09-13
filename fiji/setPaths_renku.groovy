import java.util.prefs.Preferences;
import ij.IJ

// to use ilastik from Fiji
Preferences ilastik_prefs = Preferences.userRoot().node("org/ilastik/ilastik4ij/ui/IlastikOptions");
ilastik_prefs.put("executableFile", "/opt/ilastik-1.3.3post3-Linux/run_ilastik.sh");
//win ilastik_prefs.put("executableFile", "C:/ilastik-1.3.3post3/ilastik.exe");

// To use cellpose and stardist from Fiji
//
//cellpose path
IJ.run("Cellpose setup...", "cellposeenvdirectory=[/../opt/conda/] envtype=conda usegpu=false usemxnet=false usefastmode=false useresample=false version=2.0");
//stardist path
IJ.run("StarDist3D setup...", "stardistenvdirectory=[/../opt/conda/] envtype=conda");

 	

