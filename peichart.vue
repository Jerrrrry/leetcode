<template>
  <canvas v-el:canvas style="width:100%;height:100%"></canvas>
</template>

<script>
import Chart from 'chart.js'

//var that=this

export default {
  props: {
      used:{

        required:true
      },
      free:{

        required:true
      }
  },
  data () {
    return {
      test:[],
      test1:'10',
      test2:'20'
    }
  },
  methods:{
      fetchRam(){
        this.$http({url: '/api2/ramtest', method: 'GET'}).then(function (response) {
            this.$set('test', response.data)
        })
      },
      content(){
        this.test.push(this.used)
        console.log(this.test)
        this.test.push(this.free)
        console.log(this.test)
      }

  },
  created(){
    this.fetchRam()
  },
  ready() {
    // fetch canvas DOM element
    let canvas = this.$els.canvas
    //let canvas=this.$els.canvas.getContext('2d')

    // init chart.js
    let chart = new Chart(canvas, {
      type: 'pie',
      data: {
          labels: [
              "used",
              "free"
              ],
          datasets: [
              {
                  data: [29,490],
                  backgroundColor: [
                      "#FF6384",
                      "#36A2EB"

                  ],
                  hoverBackgroundColor: [
                      "#FF6384",
                      "#36A2EB"

                  ]
              }]
      }

    })
    console.log(this.test)

  }
}
</script>
