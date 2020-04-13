package mask;

import java.util.ArrayList;

import lombok.Data;

@Data
class MaskList {
	private int count;
	private int page;
	ArrayList<StoreInfos> storeInfos;
	@Data
	class StoreInfos {
		String addr;
		String code;
		Double lat;
		Double lng;
		String name;
		String type;
	}

	private int totalCount;
	private int totalPages;
}
