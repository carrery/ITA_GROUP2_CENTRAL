Ext.onReady(function() {
   
    var overrides = {
        
        b4StartDrag : function() {
           
            if (!this.el) {
                this.el = Ext.get(this.getEl());
            }
            
           
            this.originalXY = this.el.getXY();
        },
     
        onDragDrop : function(evtObj, targetElId) {
         
            var dropEl = Ext.get(targetElId);
        
                dropEl.appendChild(this.el);
              
                this.onDragOut(evtObj, targetElId);
                
                this.el.dom.style.position ='';
                this.el.dom.style.top = '';
                this.el.dom.style.left = '';
           
        },
    
        onDragEnter : function(evtObj, targetElId) {
          
            if (targetElId != this.el.dom.parentNode.id) {
                this.el.addCls('dropOK');
            }
            else {
               
                this.onDragOut();
            }
        },
  
        onDragOut : function(evtObj, targetElId) {
            this.el.removeCls('dropOK');
        }
    };

   
    var petElements = Ext.get('pets').select('div');
    Ext.each(petElements.elements, function(el) {
        var dd = Ext.create('Ext.dd.DD', el, 'petsTarget', {
            isTarget  : false
        });
        
        Ext.apply(dd, overrides);
    });

    var petsTarget = Ext.create('Ext.dd.DDTarget', 'pets','petsTarget');

    var movedTarget = Ext.create('Ext.dd.DDTarget', 'moved', 'petsTarget');


});
