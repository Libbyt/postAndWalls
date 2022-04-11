import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {
    private var post = Post(
        id = 0,
        text = "text",
        authorName = "name",
        date = 25
    )

    @Test
    fun addTest() {
        WallService.clear()
        val newPost = WallService.add(post)
        assertTrue(newPost.id != 0)
    }

    @Test
    fun updateTrue() {
        WallService.clear()

        WallService.add(Post("text", "sas", 256))
        WallService.add(Post("text2", "Author", 32))
        WallService.add(Post("text3", "AnotherAuthor", 45))

        val updatedPost = Post("text", "sas", 256)
        val result = WallService.update(1, updatedPost)

        assertTrue(result)
    }

    @Test
    fun updateFalse() {
        WallService.clear()

        WallService.add(Post("text", "sas", 256))
        WallService.add(Post("text2", "Author", 32))
        WallService.add(Post("text3", "AnotherAuthor", 45))

        val updatedPost = Post("text", "sas", 256)
        val result = WallService.update(6, updatedPost)

        assertFalse(result)
    }
}