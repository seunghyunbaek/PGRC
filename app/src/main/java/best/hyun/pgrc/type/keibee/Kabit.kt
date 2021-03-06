package best.hyun.pgrc.type.keibee

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Kabit : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_kabit)
    override val type: PET_TYPE
        get() = PET_TYPE.KEIBEE
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_kabit)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 70
    override val subElementalValue: Int
        get() = 30
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 29
    override val initLvMaxAtk: Int
        get() = 5
    override val initLvMaxDef: Int
        get() = 5
    override val initLvMaxSpd: Int
        get() = 5
    override val maxLvMaxHp: Int
        get() = 1255
    override val maxLvMaxAtk: Int
        get() = 240
    override val maxLvMaxDef: Int
        get() = 240
    override val maxLvMaxSpd: Int
        get() = 258
    override val initLvMinHp: Int
        get() = 20
    override val initLvMinAtk: Int
        get() = 4
    override val initLvMinDef: Int
        get() = 4
    override val initLvMinSpd: Int
        get() = 4
    override val maxLvMinHp: Int
        get() = 1008
    override val maxLvMinAtk: Int
        get() = 195
    override val maxLvMinDef: Int
        get() = 195
    override val maxLvMinSpd: Int
        get() = 221
    override val minAllGrowth: Double
        get() = 4.352
    override val maxAllGrowth: Double
        get() = 5.199
}