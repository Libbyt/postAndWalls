abstract class Attachment {
    abstract val type: String
}

class AudioAttachment(val audio: Audio) : Attachment() {
    override val type: String = "audio"
}

data class Audio(
    val id: Int,
    val ownerId: Int,
    val artist: String,
    val title: String,
    val duration: Int,
    val url: String,
    val lyricsId: Int,
    val albumId: Int,
    val genreId: Int,
    val date : Int
)

class VideoAttachment(val video: Video) : Attachment() {
    override val type: String = "video"
}

data class Video(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val description: String,
    val date : Int,
    val views : Int,
    val comments : Int,
    val player: String,
    val duration: Int,
)

class DocumentAttachment(val document: Document) : Attachment() {
    override val type: String = "document"
}

data class Document(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val size: Int,
    val ext : String,
    val url: String,
    val date : Int,
    val type : Int
)

class GraffitiAttachment(val graffiti: Graffiti) : Attachment() {
    override val type: String = "graffiti"
}

data class Graffiti(
    val id: Int,
    val ownerId: Int,
    val photo130 : String,
    val photo604 : String
)

class NotesAttachment(val notes: Notes) : Attachment() {
    override val type: String = "notes"
}

data class Notes(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val text: String,
    val date: String,
    val comments: Int,
    val readComments : Int,
    val viewUrl : String,
    val textWiki : String
)


