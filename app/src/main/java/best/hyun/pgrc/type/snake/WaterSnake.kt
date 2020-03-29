package best.hyun.pgrc.type.snake

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class WaterSnake : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_watersnake)
    override val type: PET_TYPE
        get() = PET_TYPE.SNAKE
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_watersnake)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
    override val subElemental: ELEMENTAL?
        get() = null
    override val mainElementalValue: Int
        get() = 100
    override val subElementalValue: Int
        get() = 0
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 63
    override val initLvMaxAtk: Int
        get() = 14
    override val initLvMaxDef: Int
        get() = 10
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLvMaxHp: Int
        get() = 1565
    override val maxLvMaxAtk: Int
        get() = 357
    override val maxLvMaxDef: Int
        get() = 258
    override val maxLvMaxSpd: Int
        get() = 189
    override val initLvMinHp: Int
        get() = 50
    override val initLvMinAtk: Int
        get() = 12
    override val initLvMinDef: Int
        get() = 8
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1355
    override val maxLvMinAtk: Int
        get() = 319
    override val maxLvMinDef: Int
        get() = 220
    override val maxLvMinSpd: Int
        get() = 158
    override val minAllGrowth: Double
        get() = 4.864
    override val maxAllGrowth: Double
        get() = 5.571
}