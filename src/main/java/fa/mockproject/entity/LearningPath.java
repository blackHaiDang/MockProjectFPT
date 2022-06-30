package fa.mockproject.entity;


import javax.persistence.*;

@Entity
@Table(name = "LearningPath")
@Cacheable
public class LearningPath {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "learning_path_id", nullable = false)
    private long learningPathId;

    @ManyToOne
    @JoinColumn(name = "topic_id")
    private Topic topic;

    @ManyToOne
<<<<<<< HEAD
    @JoinColumn(name = "trainee_candidate id", nullable = false)
=======
    @JoinColumn(name = "trainee_candidate_id", nullable = false)
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
    private Trainee trainee;

    public LearningPath() {
    }

    public LearningPath(long learningPathId, Topic topic, Trainee trainee) {
		super();
		this.learningPathId = learningPathId;
		this.topic = topic;
		this.trainee = trainee;
	}

	public long getLearningPathId() {
        return learningPathId;
    }

    public void setLearningPathId(Integer learningPathId) {
        this.learningPathId = learningPathId;
    }

    public Topic getTopicId() {
        return topic;
    }

    public void setTopicId(Topic topic) {
        this.topic = topic;
    }

}

