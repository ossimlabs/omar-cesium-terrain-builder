package omar.cesium.terrain.builder


class TilesService {

    def generateTiles( params ) {
        def filename = new File( "${ params.filename }" )
        def outputDirectory = new File( "${ params.outputDirectory }" )

        def command = "ctb-tile -o ${ outputDirectory.absolutePath } ${ filename.absolutePath }"
        println command
        def process = command.execute()


        return '''{ "status": "done" }'''
    }
}
