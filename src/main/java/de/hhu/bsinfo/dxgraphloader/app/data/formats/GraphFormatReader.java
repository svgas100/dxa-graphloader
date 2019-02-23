package de.hhu.bsinfo.dxgraphloader.app.data.formats;

import de.hhu.bsinfo.dxgraphloader.app.data.PeerVertexMap;
import de.hhu.bsinfo.dxram.chunk.ChunkService;

public abstract class GraphFormatReader {

    private ChunkService chunkService;

    public GraphFormatReader() {
    }

    public abstract boolean execute(final byte[] content, final ChunkService chunkService, final short current_peer, PeerVertexMap peerVertexMap);

    public void createVertex(String key){

    }
}
