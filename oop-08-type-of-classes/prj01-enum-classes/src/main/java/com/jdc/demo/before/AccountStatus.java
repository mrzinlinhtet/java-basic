package com.jdc.demo.before;

public enum AccountStatus {
	Applied {
		@Override
		public String getDescription() {
			return "Member has been applied from sign up page.";
		}
	},
	Approved {
		@Override
		public String getDescription() {
			return "Member has been approved by admin";
		}
	},
	Rejected {
		@Override
		public String getDescription() {
			return "Member has been rejected by admin";
		}
	},
	Preprovation {
		@Override
		public String getDescription() {
			return "Pre-provation";
		}
	};

	public abstract String getDescription();
}
