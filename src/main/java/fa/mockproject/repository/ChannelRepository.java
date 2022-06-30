package fa.mockproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
=======
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
import org.springframework.stereotype.Repository;

import fa.mockproject.entity.Channel;

@Repository
<<<<<<< HEAD
public interface ChannelRepository extends JpaRepository<Channel, String>{

=======
public interface ChannelRepository extends JpaRepository<Channel, String> {
	@Query(value = "SELECT c from Channel c where c.channelId LIKE '%' || :word || '%' "
			+ "OR c.channelName LIKE '%' || :word || '%' " + "OR c.remarks LIKE '%' || :word || '%' ")
	public List<Channel> search(@Param("word") String word);
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
}
