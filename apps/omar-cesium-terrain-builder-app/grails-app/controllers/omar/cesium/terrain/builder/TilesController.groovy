package omar.cesium.terrain.builder


class TilesController {

    def tilesService


    def index() {
        render tilesService.generateTiles( params )
    }
}
