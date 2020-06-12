package shemar.springboot.quickstart.courseapi.topic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

    //getAllTopics
    //getTopic(String id)
    //updateTopic(Topic t)
    //deleteTopic(String id)

}
