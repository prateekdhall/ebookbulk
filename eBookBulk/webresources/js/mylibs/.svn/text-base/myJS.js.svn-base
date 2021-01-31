$(document).ready(function(){
		/* *** Fancybox ***
	**************** */
	$("a.popup").fancybox({
	'width'				: '95%',
	'height'			: '96%',
	'autoScale'			: true,
	'transitionIn'		: 'elastic',
	'transitionOut'		: 'elastic',
	'type'				: 'iframe',
	'scrolling'   		: 'auto',
	'padding'			: '0',
	'margin'			: '0',
	'top'				: '0',
	'left'				: '0'
	});

          // Custom sorting plugin
          (function($) {
          	$.fn.sorted = function(customOptions) {
          		var options = {
          			reversed: false,
          			by: function(a) { return a.text(); }
          		};
          		$.extend(options, customOptions);
          		$data = $(this);
          		arr = $data.get();
          		arr.sort(function(a, b) {
          		   	var valA = options.by($(a));
          		   	var valB = options.by($(b));
          			if (options.reversed) {
          				return (valA < valB) ? 1 : (valA > valB) ? -1 : 0;				
          			} else {		
          				return (valA < valB) ? -1 : (valA > valB) ? 1 : 0;	
          			}
          		});
          		return $(arr);
				
          	};
          })(jQuery);
      
          // DOMContentLoaded
         $(function() {
	  
	  var read_button = function(class_names) {
		var r = {
		  selected: false,
		  type: 0
		};
		for (var i=0; i < class_names.length; i++) {
		  if (class_names[i].indexOf('selected-') == 0) {
			r.selected = true;
		  }
		  if (class_names[i].indexOf('segment-') == 0) {
			r.segment = class_names[i].split('-')[1];
		  }
		};
		return r;
	  };
	  
	  var determine_sort = function($buttons) {
		var $selected = $buttons.parent().filter('[class*="selected-"]');
		return $selected.find('a').attr('data-value');
	  };
	  
	  var determine_kind = function($buttons) {
		var $selected = $buttons.parent().filter('[class*="selected-"]');
		return $selected.find('a').attr('data-value');
	  };
	  
	 
	  
	  var $list = $('#list');
	  var $data = $list.clone();
	  
	  var $controls = $('ul.splitter');
	  
	  $controls.each(function(i) {
		
		var $control = $(this);
		var $buttons = $control.find('a');
		
		$buttons.bind('click', function(e) {
		  
		  var $button = $(this);
		  var $button_container = $button.parent();
		  var button_properties = read_button($button_container.attr('class').split(' '));      
		  var selected = button_properties.selected;
		  var button_segment = button_properties.segment;

		  if (!selected) {

			$buttons.parent().removeClass('selected-0').removeClass('selected-1').removeClass('selected-2');
			$button_container.addClass('selected-' + button_segment);
			
			var sorting_type = determine_sort($controls.eq(1).find('a'));
			var sorting_kind = determine_kind($controls.eq(0).find('a'));
			
			if (sorting_kind == 'all') {
			  var $filtered_data = $data.find('li');
			} else {
			  var $filtered_data = $data.find('li.' + sorting_kind);
			}
			
			if (sorting_type == 'size') {
			  var $sorted_data = $filtered_data.sorted({
				by: function(v) {
				  return parseFloat($(v).find('span').text());
				}
			  });
			
			} else {
			  var $sorted_data = $filtered_data.sorted({
				by: function(v) {
				  return $(v).find('h2').text().toLowerCase();
				}
			  });  
			  
			}
			
			
			//$list.quicksand($sorted_data);
			// finally, call quicksand
          	  $list.quicksand($sorted_data, {							  
          	    duration: 800,
          	    easing: 'easeInOutQuad',
				enhancement: function() {
				$("a.preview_btn, a.details_btn").fancybox({
				'width'				: '95%',
				'height'			: '90%',
				'autoScale'			: true,
				'transitionIn'		: 'elastic',
				'transitionOut'		: 'elastic',
				'type'				: 'iframe',
				'scrolling'   		: 'auto',
				'padding'			: '0',
				'margin'			: '0',
				'top'				: '0',
				'left'				: '0'					
			});
				
				}
          	  });
		  }
		  
		  e.preventDefault();
		});
		
	  }); 

	});
		  // Hover function
	$(".template_gallery > li")
	.live('mouseover', function() {
		$(".template_gallery >li.open").removeClass("open");
		$(this).removeClass("opacize").addClass("open");
	})
	.live('mouseout', function () {
		$(this).removeClass("open");			
	});
});