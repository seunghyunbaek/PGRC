package best.hyun.pgrc.type.snake

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class WindSnake : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_windsnake)
    override val type: PET_TYPE
        get() = PET_TYPE.SNAKE
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_windsnake)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
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
        get() = 64
    override val initLvMaxAtk: Int
        get() = 15
    override val initLvMaxDef: Int
        get() = 10
    override val initLvMaxSpd: Int
        get() = 9
    override val maxLvMaxHp: Int
        get() = 1480
    override val maxLvMaxAtk: Int
        get() = 362
    override val maxLvMaxDef: Int
        get() = 238
    override val maxLvMaxSpd: Int
        get() = 225
    override val initLvMinHp: Int
        get() = 50
    override val initLvMinAtk: Int
        get() = 13
    override val initLvMinDef: Int
        get() = 7
    override val initLvMinSpd: Int
        get() = 7
    override val maxLvMinHp: Int
        get() = 1269
    override val maxLvMinAtk: Int
        get() = 323
    override val maxLvMinDef: Int
        get() = 199
    override val maxLvMinSpd: Int
        get() = 193
    override val minAllGrowth: Double
        get() = 4.983
    override val maxAllGrowth: Double
        get() = 5.690
}