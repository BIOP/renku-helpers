def targetStream = new FileInputStream( new File ( "/qupath/qp_prefs.xml" ) )
println targetStream
PathPrefs.importPreferences( targetStream )

import qupath.lib.gui.prefs.PathPrefs