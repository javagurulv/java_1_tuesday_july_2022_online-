package teacher.lesson_4_if_statement.lessoncode;

class WirelessLoudSpeakerTest {

	public static void main(String[] args) {
		WirelessLoudSpeakerTest speakerTest = new WirelessLoudSpeakerTest();
		speakerTest.test1();
		speakerTest.test2();
		speakerTest.test3();
		speakerTest.test4();
		speakerTest.test5();
		speakerTest.test6();
		speakerTest.test7();
	}

	// Включается ли колонка?
	public void test1() {
		WirelessLoudSpeaker speaker =
				new WirelessLoudSpeaker("Samsumg", false);
		speaker.switchOn();
		if (speaker.isOn() == true) {
			System.out.println("TEST 1 = OK");
		} else {
			System.out.println("TEST 1 = FALSE");
		}
	}

	// Выключается ли колонка
	public void test2() {
		WirelessLoudSpeaker speaker =
				new WirelessLoudSpeaker("Samsumg", true);
		speaker.switchOff();
		if (speaker.isOn() == false) {
			System.out.println("TEST 2 = OK");
		} else {
			System.out.println("TEST 2 = FALSE");
		}
	}

	// Колонка включена, можно ли увеличить звук
	public void test3() {
		WirelessLoudSpeaker speaker =
				new WirelessLoudSpeaker("Samsumg", true);
		int soundVolumeBefore = speaker.getSoundVolume();
		speaker.increaseSound();
		int soundVolumeAfter = speaker.getSoundVolume();
		if (soundVolumeAfter > soundVolumeBefore) {
			System.out.println("TEST 3 = OK");
		} else {
			System.out.println("TEST 3 = FALSE");
		}
	}

	// Колонка выключена, можно ли увеличить звук
	public void test4() {
		WirelessLoudSpeaker speaker =
				new WirelessLoudSpeaker("Samsumg", false);
		int soundVolumeBefore = speaker.getSoundVolume();
		speaker.increaseSound();
		int soundVolumeAfter = speaker.getSoundVolume();
		if (soundVolumeAfter == soundVolumeBefore) {
			System.out.println("TEST 4 = OK");
		} else {
			System.out.println("TEST 4 = FALSE");
		}
	}

	// Колонка включена, можно ли уменьшить звук
	public void test5() {
		WirelessLoudSpeaker speaker =
				new WirelessLoudSpeaker("Samsumg", true);
		speaker.increaseSound();
		int soundVolumeBefore = speaker.getSoundVolume();
		speaker.decreaseSound();
		int soundVolumeAfter = speaker.getSoundVolume();
		if (soundVolumeAfter < soundVolumeBefore) {
			System.out.println("TEST 5 = OK");
		} else {
			System.out.println("TEST 5 = FALSE");
		}
	}

	public void test6() {
		WirelessLoudSpeaker speaker =
				new WirelessLoudSpeaker("Samsumg", true);
		int soundVolumeBefore = speaker.getSoundVolume();
		speaker.decreaseSound();
		int soundVolumeAfter = speaker.getSoundVolume();
		if ((soundVolumeBefore == 0) && (soundVolumeAfter == 0)) {
			System.out.println("TEST 6 = OK");
		} else {
			System.out.println("TEST 6 = FALSE");
		}
	}

	// Колонка выключена, можно ли уменьшить звук
	public void test7() {
		WirelessLoudSpeaker speaker =
				new WirelessLoudSpeaker("Samsumg", false);
		int soundVolumeBefore = speaker.getSoundVolume();
		speaker.decreaseSound();
		int soundVolumeAfter = speaker.getSoundVolume();
		if (soundVolumeBefore == soundVolumeAfter) {
			System.out.println("TEST 7 = OK");
		} else {
			System.out.println("TEST 7 = FALSE");
		}
	}

}