(function() {
	var app = angular.module('store', []);

	app.controller('StoreController', function() {
		this.products = gems;
	});

	app.controller("PanelController", function() {
		this.tab = 3;
		this.selectTab = function(setTab) {
			this.tab = setTab;
		};
		this.isSelected = function(checkTab) {
			return this.tab === checkTab;
		};
	});

	app.controller("ReviewController", function(){
		this.review = {};
		this.addReview = function(product) {
			product.reviews.push(this.review);
			this.review = {};
		};
	});

	var gem = {
		name: 'Dodecahedron',
		price: 2.95,
		description: 'test Dodecahedron',
		canPurchase: true,
		soldOut: false
	}

	var gems = [{
		name: "Dodecahedron",
		price: 2.95,
		description: "test Dodecahedron",
		canPurchase: true,
		images: [{
			full: '5769/5777512.png',
			thumb: '5769/5777513.png'
		}, {
			full: '5769/5777514.png',
			thumb: '5769/5777515.png'
		}],
		reviews: [{
			stars: 5,
			body: "I love this product!",
			author: "joe@thomas.com"
		}, {
			stars: 1,
			body: "This product sucks",
			author: "tim@hater.com"
		}]
	}, {
		name: "Pentagonal Gem",
		price: 5.95,
		description: "test Pentagonal Gem",
		canPurchase: false,
		images: [{
			full: '5769/5777516.png',
			thumb: '5769/5777517.png'
		}, {
			full: '5769/5777518.png',
			thumb: '5769/5777519.png'
		}],
		reviews: [{
			stars: 5,
			body: "I love this product!",
			author: "joe@thomas.com"
		}, {
			stars: 1,
			body: "This product sucks",
			author: "tim@hater.com"
		}]
	}];
})();