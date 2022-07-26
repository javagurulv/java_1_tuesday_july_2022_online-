package teacher.lesson_4_if_statement.lessoncode;

class WirelessLoudSpeaker {

	private static final int MIN_SOUND_VOLUME = 0;
	private static final int MAX_SOUND_VOLUME = 10;

	private final String model;
	private boolean isOn;
	private int soundVolume;

	public WirelessLoudSpeaker(String wirelessModel,
							   boolean isSwitchedOn) {
		this.model = wirelessModel;
		this.isOn = isSwitchedOn;
		this.soundVolume = MIN_SOUND_VOLUME;
	}

	public String getModel() {
		return this.model;
	}

	public void switchOn() {
		this.isOn = true;
		System.out.println("Switched ON!");
	}

	public void switchOff() {
		this.isOn = false;
		System.out.println("Switched OFF!");
	}

	public boolean isOn() {
		return this.isOn;
	}

	public int getSoundVolume() {
		return this.soundVolume;
	}

	private boolean isSoundVolumeLessThenMax() {
		return this.soundVolume < MAX_SOUND_VOLUME;
	}

	private boolean isSoundVolumeBiggerThenMin() {
		return this.soundVolume > MIN_SOUND_VOLUME;
	}

	public void increaseSound() {
		if (isOn() && isSoundVolumeLessThenMax()) {
			this.soundVolume = this.soundVolume + 1;
		}
	}

	public void decreaseSound() {
		if ((this.isOn == true)
				&& (this.soundVolume > MIN_SOUND_VOLUME)) {
			this.soundVolume = this.soundVolume - 1;
		}

		/*
		if (isOn() && isSoundVolumeBiggerThenMin()) {
			this.soundVolume = this.soundVolume - 1;
		}
		*/

	}

}
