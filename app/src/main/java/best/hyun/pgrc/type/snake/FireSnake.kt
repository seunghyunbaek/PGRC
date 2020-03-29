package best.hyun.pgrc.type.snake

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class FireSnake : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_firesnake)
    override val type: PET_TYPE
        get() = PET_TYPE.SNAKE
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_firesnake)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
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
        get() = 65
    override val initLvMaxAtk: Int
        get() = 16
    override val initLvMaxDef: Int
        get() = 11
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLvMaxHp: Int
        get() = 1501
    override val maxLvMaxAtk: Int
        get() = 376
    override val maxLvMaxDef: Int
        get() = 252
    override val maxLvMaxSpd: Int
        get() = 190
    override val initLvMinHp: Int
        get() = 51
    override val initLvMinAtk: Int
        get() = 13
    override val initLvMinDef: Int
        get() = 8
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1290
    override val maxLvMinAtk: Int
        get() = 338
    override val maxLvMinDef: Int
        get() = 213
    override val maxLvMinSpd: Int
        get() = 158
    override val minAllGrowth: Double
        get() = 4.940
    override val maxAllGrowth: Double
        get() = 5.647
}