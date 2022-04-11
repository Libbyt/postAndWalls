data class Post(
    val text: String,
    val authorName: String,
    val date: Int,
    val attachment: Array<Attachment> = emptyArray(),
    val signerId: Int? = null,
    val id: Int = 0,
)


object WallService {
    private var nextId = 0
    private var posts = emptyArray<Post>()

    fun clear() {
        nextId = 0
        posts = emptyArray()
    }

    fun add(post: Post): Post {
        nextId += 1
        posts += post.copy(id = nextId)
        return posts.last()
    }

    fun update(id: Int, newPost: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == id) {
                posts[index] = newPost.copy(id = post.id, date = post.date)
                return true
            }
        }
        return false
    }
}
