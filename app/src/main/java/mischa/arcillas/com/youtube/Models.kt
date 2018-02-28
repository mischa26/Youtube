package mischa.arcillas.com.youtube

/**
 * Created by Mischa on 26/02/2018.
 */
class HomeFeed(val videos: List<Video>)

class Video(val id: Int, val name: String, val link: String, val imageUrl: String, val numberOfViews: Int, val channel: Channel)

class Channel(val name: String, val profileImageUrl: String)

class CourseLesson(val name: String, val duration: String, val number: Int, val imageUrl: String, val link: String)